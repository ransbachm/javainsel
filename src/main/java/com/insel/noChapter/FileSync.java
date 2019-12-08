package com.insel.noChapter;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class FileSync {
	public static void main(String [] args) throws IOException {
		Path p = Paths.get("C:\\Users\\ransb\\Desktop\\Experiments\\Snycer");
		WatchService watcher = FileSystems.getDefault().newWatchService();
		
		try {
			WatchKey key = p.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY); 
		} catch (IOException e) {
			System.err.println(e);
		}
		
		for(;;) {
			WatchKey key;
			try {
				key = watcher.take();
			} catch (InterruptedException e) {
				return;
			}
			
			for(WatchEvent<?> event: key.pollEvents()) {
				WatchEvent.Kind<?> kind = event.kind();
				
				if(kind == OVERFLOW) {
					continue;
				}
				
				WatchEvent<Path> ev = (WatchEvent<Path>) event;
				Path filename = ev.context();
				
				System.out.println(filename + " " + ev.kind());
				
				
			}
			boolean valid = key.reset();
			if(!valid) {
				break;
			}
			
		}
	}

}

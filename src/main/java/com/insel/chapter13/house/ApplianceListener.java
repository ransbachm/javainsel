package com.insel.chapter13.house;

import java.util.EventListener;

interface ApplianceListener extends EventListener {
	void modify(ApplianceEvent a);

}

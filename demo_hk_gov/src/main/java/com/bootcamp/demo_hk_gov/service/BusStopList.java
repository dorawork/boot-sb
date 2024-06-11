package com.bootcamp.demo_hk_gov.service;

import com.bootcamp.demo_hk_gov.model.StopList;

public interface BusStopList {

  StopList getStopList(); // () <--因為restTemplate已經寫好了
}

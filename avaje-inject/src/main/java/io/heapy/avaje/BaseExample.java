package io.heapy.avaje;

import jakarta.inject.Singleton;;

@Singleton
class Service {
  private final SubService subService;

  Service(SubService subService) {
    this.subService = subService;
  }

  public String doIt() {
    return "ServiceImpl_" + subService.doIt();
  }
}

@Singleton
class SubService {
  public String doIt() {
    return "SubServiceImpl";
  }
}

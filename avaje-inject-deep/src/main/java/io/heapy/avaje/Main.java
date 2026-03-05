package io.heapy.avaje;

import io.avaje.inject.BeanScope;

public class Main {

  public static void main(String[] args) {
    BeanScope scope = BeanScope.builder().build();
    System.out.println(scope.get(Service.class).name());
  }
}

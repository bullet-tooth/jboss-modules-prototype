package com.example.prototype.foo;

import com.example.prototype.api.Service;

public class FooService implements Service {

  @Override
  public void sayWhatsup() {
    System.out.println("Wazzap from Foo");
  }

}

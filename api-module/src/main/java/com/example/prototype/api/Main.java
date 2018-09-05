package com.example.prototype.api;

import java.io.File;
import java.util.ServiceLoader;
import org.jboss.modules.LocalModuleFinder;
import org.jboss.modules.Module;
import org.jboss.modules.ModuleLoader;

public class Main {

  public static void main(String[] args) throws Throwable {
    File root = new File("prototype");

    ModuleLoader loader = new ModuleLoader(new LocalModuleFinder(new File[]{root}));
    Module module = loader.loadModule("com.example.prototype.foo");
    ServiceLoader<Service> services = module.loadService(Service.class);

    System.out.println("Foo Service loaded");
    services.forEach(Service::sayWhatsup);
    System.out.println("Done!");
  }

}

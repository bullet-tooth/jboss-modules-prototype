package com.example.prototype.foo;

import com.example.prototype.api.Service;
import java.io.File;
import java.util.ServiceLoader;
import org.jboss.modules.LocalModuleFinder;
import org.jboss.modules.Module;
import org.jboss.modules.ModuleLoadException;
import org.jboss.modules.ModuleLoader;

public class Main {

  public static void main(String[] args) throws ModuleLoadException {
//    new FooService().sayWhatsup();

//    File root = new File("prototype");
//
//    ModuleLoader loader = new ModuleLoader(new LocalModuleFinder(new File[]{root}));
//    Module module = loader.loadModule("com.example.prototype.foo");
//
//    ServiceLoader<FooService> services = module.loadService(FooService.class);
//    services.forEach(FooService::sayWhatsup);

    Service service = new FooService();
    service.sayWhatsup();

    System.out.println("Done!");
  }

}

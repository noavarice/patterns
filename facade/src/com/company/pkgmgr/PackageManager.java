package com.company.pkgmgr;

public class PackageManager {

  private final PackageResolver resolver = new PackageResolver();

  private Package lastInstalled;

  private Package fetchPackage() {
    // actions
    return null;
  }

  private void integrate(final Package pkg) {
    // some actions
  }

  public void install(final String packageName) {
    if (!resolver.isPresent(packageName)) {
      System.out.println("Package not found");
      return;
    }

    lastInstalled = fetchPackage();
    if (lastInstalled == null) {
      System.out.println("Cannot fetch package - network is too slow");
      return;
    }

    integrate(lastInstalled);
  }
}

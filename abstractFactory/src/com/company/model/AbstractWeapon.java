package com.company.model;

public abstract class AbstractWeapon {

  protected final int basicDamage;

  public AbstractWeapon(final int basicDamage) {
    this.basicDamage = basicDamage;
  }

  public int getBasicDamage() {
    return basicDamage;
  }

  public abstract int getPhysicalDamage();

  public abstract int getMagicDamage();
}

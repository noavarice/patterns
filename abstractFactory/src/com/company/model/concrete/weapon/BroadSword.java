package com.company.model.concrete.weapon;

import com.company.model.AbstractWeapon;

public class BroadSword extends AbstractWeapon {

  public BroadSword(int basicDamage) {
    super(basicDamage);
  }

  @Override
  public int getPhysicalDamage() {
    return basicDamage;
  }

  @Override
  public int getMagicDamage() {
    return 0;
  }
}

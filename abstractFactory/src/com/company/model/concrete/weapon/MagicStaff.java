package com.company.model.concrete.weapon;

import com.company.model.AbstractWeapon;

public class MagicStaff extends AbstractWeapon {

  public MagicStaff(int basicDamage) {
    super(basicDamage);
  }

  @Override
  public int getPhysicalDamage() {
    return 0;
  }

  @Override
  public int getMagicDamage() {
    return basicDamage;
  }
}

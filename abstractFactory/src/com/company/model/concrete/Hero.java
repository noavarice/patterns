package com.company.model.concrete;

import com.company.model.AbstractArmor;
import com.company.model.AbstractWeapon;

public class Hero {

  private final AbstractWeapon weapon;

  private final AbstractArmor armor;

  public Hero(final AbstractWeapon weapon, final AbstractArmor armor) {
    this.weapon = weapon;
    this.armor = armor;
  }

  public AbstractWeapon getWeapon() {
    return weapon;
  }

  public AbstractArmor getArmor() {
    return armor;
  }
}

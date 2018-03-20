package com.company.factory.impl;

import com.company.factory.IHeroFactory;
import com.company.model.AbstractArmor;
import com.company.model.AbstractWeapon;
import com.company.model.concrete.armor.ChainMailArmor;
import com.company.model.concrete.weapon.BroadSword;

public class SwordsmanFactory implements IHeroFactory {

  @Override
  public AbstractWeapon getWeapon() {
    return new BroadSword(20);
  }

  @Override
  public AbstractArmor getArmor() {
    return new ChainMailArmor(20);
  }
}

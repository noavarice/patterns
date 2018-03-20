package com.company.factory.impl;

import com.company.factory.IHeroFactory;
import com.company.model.AbstractArmor;
import com.company.model.AbstractWeapon;
import com.company.model.concrete.armor.EnchantedArmor;
import com.company.model.concrete.weapon.MagicStaff;

public class WizardFactory implements IHeroFactory {

  @Override
  public AbstractWeapon getWeapon() {
    return new MagicStaff(10);
  }

  @Override
  public AbstractArmor getArmor() {
    return new EnchantedArmor(2);
  }
}

package com.company.factory;

import com.company.model.AbstractArmor;
import com.company.model.AbstractWeapon;

public interface IHeroFactory {

  AbstractWeapon getWeapon();

  AbstractArmor getArmor();
}

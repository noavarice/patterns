package com.company.model.concrete.armor;

import com.company.model.AbstractArmor;

public class EnchantedArmor extends AbstractArmor {

  public EnchantedArmor(int weight) {
    super(weight);
  }

  @Override
  public int getPhysicalAttackProtection() {
    return 0;
  }

  @Override
  public int getMagicResistance() {
    return 10;
  }
}

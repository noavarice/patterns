package com.company.model.concrete.armor;

import com.company.model.AbstractArmor;

public class ChainMailArmor extends AbstractArmor {

  public ChainMailArmor(int weight) {
    super(weight);
  }

  @Override
  public int getPhysicalAttackProtection() {
    return 10;
  }

  @Override
  public int getMagicResistance() {
    return 0;
  }
}

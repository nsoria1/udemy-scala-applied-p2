
/* Copyright (C) 2010-2018 Escalate Software, LLC. All rights reserved. */

package lab.awesome.laser {
  class Gun(val wattage: Int) {

    class Beam(val lumens: Int)

    def shoot(): Beam = {
      val res = new Beam(wattage * 10)
      res
    }
  }
}
@android
  Feature: long press and tap multiple times on list menu

    Scenario: long press on list menu
      Given user already on list menu
      When user tap hold on list keempat
      Then info message will appear

    Scenario: multiple tap on list menu
      Given user already on list menu
      When user multiple tap on list ke enam puluh
      Then info message will appear



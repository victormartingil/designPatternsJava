# Design Patterns

## Factory Design Pattern
* The factory returns an Interface which have several implementations (ie NotificationService, which is implemented by SmsNotificationServiceImpl and EmailNotificationServiceImpl)
* From this interface (NotificationService) we call the common method which automatically will be redirected to overrid the implemented method.

## Abstract Factory
* A Factory Producer returns a Factory which extends from AbstractFactory
* The rest is like Factory Design Pattern.

## Singleton
* This pattern prevent we instantiate more than one object from same class.

## Prototype
* With this pattern we can clone an object similar. 
* We need to extend an interface ie "Cuenta" from "Cloneable" class
* We can call from Implementation ie "CuentaImpl", the clone() method which will return the interface type (we need to cast this to the implemented type).

## Builder

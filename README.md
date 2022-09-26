# Design Patterns

## Factory Design Pattern
* The factory returns an Interface which have several implementations (ie NotificationService, which is implemented by SmsNotificationServiceImpl and EmailNotificationServiceImpl)
* From this interface (NotificationService) we call the common method which automatically will be redirected to overrid the implemented method.

## Abstract Factory
* A Factory Producer returns a Factory which extends from AbstractFactory
* The rest is like Factory Design Pattern.

## Singleton


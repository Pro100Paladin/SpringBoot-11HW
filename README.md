Домашнее задание
1. Доделать logging-aspect: добавить настройку boolean printArgs = false. 
    Если значение true, тогда в аспекте логировать значения аргументов.
2. ** Вынести RecoverAspect в стартер. Добавить в его конфигурацию настройки: 
- boolean enabled - включает\выключает работу аспекта
- **** List<String> noRecoverFor - список названий классов (полное имя) исключений, для которых НЕ нужно делать Recover.
‣灓楲杮潂瑯ㄭ䠱੗

INSERT INTO `quarkus_db`.`owners` (`id`, `firstName`, `lastName`) VALUES ('1', 'Uzun', 'Natalia');
INSERT INTO `quarkus_db`.`owners` (`id`, `firstName`, `lastName`) VALUES ('2', 'Uzun', 'Valentina');
INSERT INTO `quarkus_db`.`owners` (`id`, `firstName`, `lastName`) VALUES ('3', 'Uzun', 'Aliona');
INSERT INTO `quarkus_db`.`owners` (`id`, `firstName`, `lastName`) VALUES ('4', 'Uzun', 'Alexandr');
INSERT INTO `quarkus_db`.`owners` (`id`, `firstName`, `lastName`) VALUES ('6', 'Uzun', 'AAAAAAA');

INSERT INTO `quarkus_db`.`cats` (`id`, `age`, `color`, `name`, `owner_id`) VALUES ('1', '1', 'Black', 'Ugolek', '2');
INSERT INTO `quarkus_db`.`cats` (`id`, `age`, `color`, `name`, `owner_id`) VALUES ('2', '2', 'Brown', 'Murzik', '1');
INSERT INTO `quarkus_db`.`cats` (`id`, `age`, `color`, `name`, `owner_id`) VALUES ('3', '1', 'White', 'Jessy', '4');
INSERT INTO `quarkus_db`.`cats` (`id`, `age`, `color`, `name`, `owner_id`) VALUES ('4', '5', 'Ginger', 'Lucy', '3');

INSERT INTO `quarkus_db`.`toys` (`id`, `name`, `size`) VALUES ('1', 'Bear', 'Small');
INSERT INTO `quarkus_db`.`toys` (`id`, `name`, `size`) VALUES ('2', 'Mouse', 'Big');
INSERT INTO `quarkus_db`.`toys` (`id`, `name`, `size`) VALUES ('3', 'Crew', 'Medium');


INSERT INTO `quarkus_db`.`toys_cats` (`Toy_id`, `cats_id`) VALUES ('1', '2');
INSERT INTO `quarkus_db`.`toys_cats` (`Toy_id`, `cats_id`) VALUES ('1', '3');
INSERT INTO `quarkus_db`.`toys_cats` (`Toy_id`, `cats_id`) VALUES ('1', '4');
INSERT INTO `quarkus_db`.`toys_cats` (`Toy_id`, `cats_id`) VALUES ('2', '2');
INSERT INTO `quarkus_db`.`toys_cats` (`Toy_id`, `cats_id`) VALUES ('2', '1');
INSERT INTO `quarkus_db`.`toys_cats` (`Toy_id`, `cats_id`) VALUES ('3', '4');
INSERT INTO `quarkus_db`.`toys_cats` (`Toy_id`, `cats_id`) VALUES ('3', '3');
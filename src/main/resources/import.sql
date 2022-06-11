-- CREATE TABLE IF NOT EXISTS `user` (
--                         `id` bigint NOT NULL,
--                         `email` varchar(255) DEFAULT NULL,
--                         `nickname` varchar(255) DEFAULT NULL,
--                         `password` varchar(255) DEFAULT NULL,
--                         PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
--
--
-- CREATE TABLE IF NOT EXISTS `message` (
--                            `id` bigint NOT NULL,
--                            `message_text` varchar(255) DEFAULT NULL,
--                            `message_title` varchar(255) DEFAULT NULL,
--                            `user_id` bigint DEFAULT NULL,
--                            PRIMARY KEY (`id`),
--                            KEY `FKb3y6etti1cfougkdr0qiiemgv` (`user_id`),
--                            CONSTRAINT `FKb3y6etti1cfougkdr0qiiemgv` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `diplom_db`.`user` (`id`, `email`, `nickname`, `password`) VALUES ('1', 'admin@gmail.com', 'admin', 'admin');
INSERT INTO `diplom_db`.`user` (`id`, `email`, `nickname`, `password`) VALUES ('2', 'natalia@gmail.com', 'natalia', 'natalia');
INSERT INTO `diplom_db`.`user` (`id`, `email`, `nickname`, `password`) VALUES ('3', 'valentina@gmail.com', 'valentina', 'valentina');
INSERT INTO `diplom_db`.`user` (`id`, `email`, `nickname`, `password`) VALUES ('4', 'aliona@gmail.com', 'aliona', 'aliona');
INSERT INTO `diplom_db`.`user` (`id`, `email`, `nickname`, `password`) VALUES ('5', 'alexandr@gmail.com', 'alexandr', 'alexandr');

INSERT INTO `diplom_db`.`message` (`id`, `message_text`, `message_title`, `user_id`) VALUES ('1', 'На протяжении нескольких лет меня бьют мои родители!', 'Домашнее насилие.', '2');
INSERT INTO `diplom_db`.`message` (`id`, `message_text`, `message_title`, `user_id`) VALUES ('2', 'Мне кажется, я ничего из себя не представляю.', 'Низкая самооценка.', '3');
INSERT INTO `diplom_db`.`message` (`id`, `message_text`, `message_title`, `user_id`) VALUES ('3', 'Я потеряла близкого мне человека и мне кажется, я не смогу без него жить.', 'Суицидальные мысли.', '2');
INSERT INTO `diplom_db`.`message` (`id`, `message_text`, `message_title`, `user_id`) VALUES ('4', 'Скажите в чем смысл жизни?', 'Смысл жизни', '5');
INSERT INTO `diplom_db`.`message` (`id`, `message_text`, `message_title`, `user_id`) VALUES ('5', 'Я несколько лет нахожусь с человеком, который меня не ценит. Я так устала, но и расстаться не могу.', 'Болезненные отношения', '4');
INSERT INTO `diplom_db`.`message` (`id`, `message_text`, `message_title`, `user_id`) VALUES ('6', 'Со мной кое-что случилось и мне стыдно об этом говорить, но я должен с кем-то поговорить. Помогите!', 'Насилие', '5');

-- CREATE VIEW message_user AS
-- SELECT message.message_text, message.message_title, user.email
-- FROM message
--          INNER JOIN user
--                     ON message.user_id=user.id;
CREATE DATABASE `gamebdwho` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

CREATE TABLE `gamer` (
                         `game_id` int(11) NOT NULL AUTO_INCREMENT,
                         `name` varchar(45) NOT NULL,
                         `email` varchar(255) NOT NULL,
                         `score` int(10) unsigned DEFAULT NULL,
                         PRIMARY KEY (`game_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `gamebdwho`.`questions` (
                                         `id` INT NOT NULL AUTO_INCREMENT,
                                         `question_text` TEXT(1000) NOT NULL,
                                         `option1` TEXT(1000) NOT NULL,
                                         `option2` TEXT(1000) NOT NULL,
                                         `option3` TEXT(1000) NOT NULL,
                                         `option4` TEXT(1000) NOT NULL,
                                         `answer` TEXT(1000) NOT NULL,
                                         `level` INT NOT NULL,
                                         PRIMARY KEY (`id`));


INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('1', '¿En qué año llegó el hombre a la Luna?', '1810', '1969', '1710', '1970', '1969', '1');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('2', '¿Cómo se conocía la Primera Guerra Mundial antes de que estallara la segunda?', 'La Gran Guerra', 'La Madre de Todas las Guerras', 'La Guerra de Guerras', 'La Guerra Total', 'La Gran Guerra', '1');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('3', '¿En qué año se disolvió la Unión Soviética?', '1910', '1991', '1891', '2001', '1991', '1');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('5', '¿Qué reina británica fue hija de los Reyes Católicos?', 'Catalina la Española', 'María de los Ángeles', 'Catalina de Aragón', 'Juana de Arco', 'Catalina de Aragón', '1');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('6', '¿Qué carabela no regresó del primer viaje de Colón al Nuevo Mundo?', 'La Niña', 'La Pinta', 'La Santa María', 'Ninguna', 'La Santa María', '1');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('7', '¿Cuál es el río más caudaloso del mundo?', 'El Atrato', 'El Nilo', 'El Amazonas', 'El Bogotá', 'El Amazonas', '2');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('8', '¿Dónde se encuentra la Casa Rosada?', 'Colombia', 'Perú', 'Brazil', 'Argentina', 'Argentina', '2');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('9', '¿A qué país pertenece la isla de Creta?', 'Francia', 'Estados Unidos', 'Irlanda', 'Grecia', 'Grecia', '2');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('10', '¿Cómo se llama la línea vertical imaginaria que divide el mundo en dos mitades?', 'El meridiano de Greenwich', 'Ninguna de las opciones', 'El Ecuador', 'El meridiano del Globo', 'El meridiano de Greenwich', '2');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('11', '¿Cuál es el país más visitado del mundo?', 'Estados Unidos', 'Perú', 'Francia', 'Colombia', 'Francia', '2');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('12', '¿Quién pintó el \'Guernica\'?', 'Diego Velázquez', 'Claude Monet', 'Pablo Picasso', 'Vincent Van Gogh', 'Pablo Picasso', '3');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('13', '¿Qué tipo de instrumento es una cítara?', 'De viento', 'De percusión', 'De cuerda', 'No es un instrumento musica', 'De cuerda', '3');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('14', '¿Cómo se llama el caballo de Don Quijote de la Mancha?\"', 'Blanco', 'Equino', 'Rocinante', 'Negrito', 'Rocinante', '3');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('15', '¿Qué pintor noruego pintó \'El grito\'?', 'Diego Velázquez', 'Pablo Picasso', 'dvard Munch', 'Vincent Van Gogh', 'Edvard Munch', '3');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('16', '¿Qué escritor español era conocido como \'El manco de Lepanto\'?', 'Miguel de Cervantes', 'García Marquez', 'Shakespeare', 'Platón', 'Miguel de Cervantes', '3');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('17', '¿Qué número viene después del 14 en los decimales del Pi?', '2', '5', '4', '1', '1', '4');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('18', '¿Cuántos elementos tiene la tabla periódica?', '118', '458', '130', '123', '118', '4');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('19', '¿Cuáles son las bases nitrogenadas del ADN?', 'Tiamina y vitamina', 'Adenina, timina, guanina y citosina', 'Oxigeno, fosforo y azufre', 'Boro, cloro y hierro', 'Adenina, timina, guanina y citosina', '4');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('20', '¿Cuál es la velocidad aproximada de la luz?', '858 kilómetros por segundo', '300.000 kilómetros por segundo', '125 metros por segundo', '1.254.000 metros por segundo', '300.000 kilómetros por segundo', '4');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('21', 'De los cinco sentidos, ¿cuál es el que se desarrolla primero?', 'El gusto', 'El olfato', 'La vista', 'El tacto', 'El olfato', '4');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('22', '¿Quién escribió la novela gráfica “Watchmen”?', 'Max Plank', 'Jhon Kennedy', 'Alan Moore', 'Jhon Carter', 'Alan Moore', '5');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('23', '¿En qué calle ficticia vivía Sherlock Holmes?', 'Baker Street', 'Fake Street', 'Upper Street', 'Downing Street', 'Baker Street', '5');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('24', '¿Cuál de los actores que ha interpretado a James Bond luchó contra el Dr. No?', 'Daniel Craig', 'Roger Moore', 'Sean Connery', 'Pierce Brosnan', 'Sean Connery', '5');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('25', '¿Cómo se llama el perro de Tintín?', 'Firulais', 'Trosky', 'Milú', 'Fifí', 'Milú', '5');
INSERT INTO `gamebdwho`.`questions` (`id`, `question_text`, `option1`, `option2`, `option3`, `option4`, `answer`, `level`) VALUES ('26', '¿La película El club de la lucha está basado en la novela homónima de qué autor?', 'Adam Placeholder', 'Jhon Carter', 'Chuck Palahniuk', 'Peter Straub', 'Chuck Palahniuk', '5');


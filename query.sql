CREATE DATABASE `gamebdwho` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

CREATE TABLE `gamer` (
                         `game_id` int(11) NOT NULL AUTO_INCREMENT,
                         `name` varchar(45) NOT NULL,
                         `email` varchar(255) NOT NULL,
                         `score` int(10) unsigned DEFAULT NULL,
                         PRIMARY KEY (`game_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `question` (
                            `question_id` int(11) NOT NULL AUTO_INCREMENT,
                            `asnwer_false01` text NOT NULL,
                            `answer_false02` text NOT NULL,
                            `answer_false03` text NOT NULL,
                            `answer_true` text NOT NULL,
                            `level` int(11) NOT NULL,
                            PRIMARY KEY (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


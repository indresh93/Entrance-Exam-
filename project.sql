-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: vit
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `examiner`
--

DROP TABLE IF EXISTS `examiner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `examiner` (
  `sno` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`sno`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `examiner`
--

LOCK TABLES `examiner` WRITE;
/*!40000 ALTER TABLE `examiner` DISABLE KEYS */;
INSERT INTO `examiner` VALUES (1,'indresh','18mca10015'),(2,'inny','12345'),(3,'aaditya','2020'),(4,'pratham','123');
/*!40000 ALTER TABLE `examiner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logindatabase`
--

DROP TABLE IF EXISTS `logindatabase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `logindatabase` (
  `sno` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sno`)
) ENGINE=MyISAM AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logindatabase`
--

LOCK TABLES `logindatabase` WRITE;
/*!40000 ALTER TABLE `logindatabase` DISABLE KEYS */;
INSERT INTO `logindatabase` VALUES (1,'indresh','12345'),(2,'pratham','11'),(3,'ram','789'),(4,'ll','88'),(5,'indresh','12'),(6,'aadi','11'),(25,'kk','10000'),(8,'aadi miradwal','505050'),(9,'indreshh','12'),(10,'aditiya','15'),(11,'guru','555'),(12,'guru','555'),(13,'guru2','122'),(14,'loken','111'),(15,'indresh','5454'),(16,'ram','789'),(24,'kk','10000'),(18,'jk','101'),(19,'kk','878'),(21,'ram','78'),(22,'rohit','111'),(23,'kkkkk','111'),(26,'incdresh55','10000');
/*!40000 ALTER TABLE `logindatabase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `question` (
  `sno` int(11) NOT NULL AUTO_INCREMENT,
  `ques` varchar(300) CHARACTER SET utf8 DEFAULT NULL,
  `a` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `b` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `c` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `d` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `ans` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`sno`)
) ENGINE=MyISAM AUTO_INCREMENT=133 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'{(481 + 426)2 - 4 × 481 × 426} = ?','3025','4200','3060','3210','c'),(2,'Which of the following is close to the meaning of the \" IMPOLITIC \"  ?','Impolite','Intolerant','Incongrous ','Injudicious','d'),(3,'What according to the author facilities creative destruction ?','Catastrophe','Modernism','Terrorism','Cosmopolitanism','a'),(4,'JAK , KBL , LCM , MDN , ____________________________ ?','OEP','NEW','MEN','PFQ','b'),(5,'Find the odd one out ?','DEHG','REVU','JKNM','LMQP','d'),(6,'how many numbers between 1 and 1000 are divisible by all numbers 2,3,4,5 and ?','16','32','17','33','a'),(7,'In the first 10 overs of a cricket game, the run rate was only 3.2. What should be the run rate in the remaining 40 overs to reach the target of 282 runs ?','6.25','5.5','7.4','0.5','a'),(8,'The average monthly income of A and B is Rs. 5050. The average monthly income of B and C is Rs. 6250 and the average monthly income of A and C is Rs. 5200. What is the monthly income of A?','2000','3000','4000','5000','c'),(9,' A bag contains 2 yellow, 3 green and 2 blue balls. Two balls are drawn at random. What is the probability that none of the balls drawn is blue ?','1/2','10/21','9/11','7/11','b'),(10,'One card is randomly drawn from a pack of 52 cards. What is the probability that the card drawn is a face card(Jack, Queen or King)','1/13','2/13','3/13','4/13','c'),(11,'A dice is thrown. What is the probability that the number shown in the dice is divisible by 3?','1/6','1/3','1/4','1/2','c'),(12,'In a dairy farm, 40 cows eat 40 bags of husk in 40 days. In how many days one cow will eat one bag of husk ?','1','40','20','26','b'),(13,'4 mat-weavers can weave 4 mats in 4 days. At the same rate, how many mats would be woven by 8 mat-weavers in 8 days ?','4','16','8','1','b'),(14,'A is 2 1?3 times as fast as B. If A gives B a start of 80 m, how long should the race course be so that both of them reach at the same time ?','1700 metre','150 metre','140 metre','160 metre','c'),(15,'. A can run 224 metre in 28 seconds and B in 32 seconds. By what distance A beat B?','36 metre','24 metre','32 metre','28 metre','d'),(16,'At a game of billiards, A can give B 15 points in 60 and A can give C to 20 points in 60. How many points can B give C in a game of 90 ?','22 points','20 points','12 points','10 points','d'),(17,' In a flight of 600 km, an aircraft was slowed down due to bad weather. Its average speed for the trip was reduced by 200 km/hr and the time of flight increased by 30 minutes. The duration of the flight is:','1 hour','2 hours','3 hours','4 hours','a'),(18,'A man complete a journey in 10 hours. He travels first half of the journey at the rate of 21 km/hr and second half at the rate of 24 km/hr. Find the total journey in km.','220 km','224','230','234','b'),(19,'A car travelling with 5/7 of its actual speed covers 42 km in 1 hr 40 min 48 sec. Find the actual speed of the car.','17 6/7 km/hr','25 km/hr','30 km/hr','35 km/hr','d'),(20,'Find the next number in the sequence: 3, 6, 9, 30, 117......','192','352','388','588','d'),(21,' Find the next number in the sequence: 26, 63, 124, 215, 342.....','416','551','686','559','b'),(22,'SCD, TEF, UGH, ____, WKL','CMN','UJI','VIJ','IJT','c'),(23,'FAG, GAF, HAI, IAH, ____','JAK','HAL','HAK','JAI','a'),(24,'If in a certain Code BOOKLET is written as DSUSVQH , then how ANSWER written in that code ?','AQYFBP','CRYEOD','DERSDY','BPZFPC','b'),(25,'DIFFICULT is coded as WRUURXFOG, then what will be the code for EXTREME ?','VEJHFDV','WFGINVF','VFCIUNG','VCGIVNV','d'),(26,'LIVE: ? :: CARE: WGLK','FOPK','GPOL','FPOK','EOPK','a'),(27,' Which of the following is a prime number ?',' 9','8 ',' 4','2','d'),(28,'What is the largest 4 digit number exactly divisible by 88?','9944','9999','9988','9900','a'),(29,'Riya starts walking in the north direction and after walking some distance she took a left turn followed by a right turn. After that she took two consecutive left turn, now she is walking in which direction?',' south','north','east','west','a'),(30,'If the number 5*2 is divisible by 6, then * = ?','2','7','3','6','a'),(31,'How many natural numbers are there between 43 and 200 which are exactly divisible by 6?','28','26','24','22','b'),(32,'What is the smallest 6 digit number exactly divisible by 111 ?','100010','100010','100012','100013','b'),(33,'If  x  and  y  are positive integers such that  ( 3 x + 7 y )  is a multiple of 11, then which of the followings are divisible by 11 ?','9 x + 4 y','x + y + 4','4 x ? 9 y','4 x + 6 y','c'),(34,'x  men working  x  hours per day can do  x  units of a work in  x  days. How much work can be completed by  y  men working  y  hours per day in  y  days ?','x 2 / y 2  units','y 3 /  x 2  units','  x 3 / y 2  units','y 2 / x 2  units','b'),(35,'persons can build a wall 140m long in 42 days. In how many days can 30 persons complete a similar wall 100 m long?','12','10','8','6','c'),(36,'The access method used for cassette tape is','Direct','Random','Sequential','All of the above','c'),(37,'A computer has a 1024K memory. What does the letter K stand for','Kilometre','Thousand','1024 ','MB','c'),(38,'Computer instructions written with the use of English words instead of binary machine code is called ?','Mnemonics','Symbolic code','Gray code','Op-code','b'),(39,'Dot-matrix is a type of','Tape','Printer','Disk','Bus','b'),(40,'Where does a computer add and compare data?','Hard disk','Floppy disk','CPU chip','Memory chip','c'),(41,'Which of the following require large computer memory?','Imaging','Graphics','Voice','All of the above','d'),(42,'Which of the following is false about disk when compared to main memory?','non-volatile','longer storage capacity','lower price per bit','faster','d'),(43,'actually schedules the tasks into the processor','puts tasks in I/O wait','puts tasks in I/O wait','s always small and simple','never changes task priorities','a'),(44,'BM released its first PC in 1981. Can you name the operating system which was most popular at that time ?','MS-DOS','PC-DOS','OS/360','CP/M','d'),(45,'Which table is a permanent database that has an entry for each terminal symbol.?','Terminal table','Literal table','Identifier table','Reductions','a'),(46,' In which of the storage placement strategies a program is placed in the largest available hole in the main memory?','best fit','first fit','worst fit','buddy','c'),(47,'Which of the following is a block device ?','mouse','printer','terminals','disk','d'),(48,'Which of the following software types is used to simplify using systems software ?','spreadsheet ','operating environment','timesharing','multitasking','c'),(49,'Which of the following is not applications software ?','Word processing','Spreadsheet','UNIX','Desktop publishing','c'),(50,' If you want to execute more than one program at a time, the systems software you are using must be capable of: ?','word processing','virtual memory','compiling','multitasking','d'),(51,'I_____tennis every Sunday morning.?','Playing','Play','am Playing','am play','b'),(52,'..... many times every winter in Frankfurt.','It snows','It snowed','It is snowing','It is snow ','a'),(53,'Find the correctly spelt words.',' Efficient',' Treatmeant ',' Beterment',' Employd','a'),(54,'Find the correctly spelt words.  ','Ommineous ','Omineous','Ominous','Omenous','c'),(55,'which best expresses the meaning of the given word. \"CORPULENT\"','Lean','Gaunt	','Emaciated','Obese','d'),(56,'which best expresses the meaning of the given word. \" BRIEF\"','Limited','Small','Little','Short','d'),(57,'which is the exact OPPOSITE of the given words \"ENORMOUS\"','Soft','Average','Average','Weak','c'),(58,'which is the exact OPPOSITE of the given words. \"ARTIFICIAL\"','Red','Natural','Truthful','Solid','b'),(59,' Choose the correct meaning of proverb/idiom  \"To make clean breast of\"','To gain prominence','To praise oneself','To confess without of reserve','To destroy before it blooms','c'),(60,'Choose the correct meaning of proverb/idiom \"To make clean breast of\"','To gain prominence','To praise oneself ','To confess without of reserve','To destroy before it blooms','c'),(61,'JAK ,  KBL  , LCM  ,  MDN , ________________________ ?','OEP','NEW','MEN','PFQ','b'),(62,'Find the odd one out ?','DEHG	','REVU','JKNM','LMQP','d'),(63,'How many numbers between 1 and 1000 are divisible by all numbers 2,3,4,5 and . ?','16','32','17','33','a'),(64,'If the day after in the day tomorrow is three days before Friday , then today is ?','tursday','thursday','saturday','monday','c'),(65,'A cube is made up of 125 one cm. square cubes placed on a table. How many squares are visible only on three sides ?','4','8','12','16','a'),(66,' Which of following is a correctly spelt word  ?  ','Hiderence','Hindrence','Hindarrence','Hindrance','d'),(67,'Chosse the one which is nearest in meaning to the word \" TRUN UP \" ?','Show up','Come up','Land up','Crop up','a'),(68,'Which letter in the word CYBERNETICS occupies the same position as it does in the English alphabet ?','C',' E','I',' T','c'),(69,'The minimum number of MOS transistors required to make a dynamic RAM cell is ?','1','2','3','4','a'),(70,'Which of the following is the antonym of the word \" Exigency \"  ?','Penchant','Emergency','Earnestness','Indifference','d'),(71,'Select the word that is furthest is meaning to the word AFFLUENCE ?','Stagnation','Misery','Neglect','Poverty','d'),(72,'If the English word \" EXAMINATION\" is coded as 56149512965 , then the word \" GOVERNMENT \" is coded as ','7645954552','7654694562','7645955423','7654964526','a'),(73,'If A is an invertible skew symmetric matrix , then A Inverse is a ?','Symmetric metrix','Skew Symmetric metrix','Zero metrix','Identity Matrix','b'),(74,'If the mean of the square of first n natural numbers be 11 , then n is equal to ?','10','11','5','4','c'),(75,'Equation of the lines perpendicular to X - 2Y = 1 and passing through (1,1) ','X + 2 = 3','X + Y = 2','Y = 2X + 3','Y = -2X','d'),(76,'The last digit of the number obtained by multiplying the numbers 81 x 82 x 83 x 84 x 85 x 86 x 87 x 88 x 89 will be ? ','0','9','7','2','a'),(77,'what type of error are not detected by assembles ?','Syntax error','Run time error','Logical error','All of  these','C'),(78,'If a signal passing through a gate in inhibited by sending a low into one of the inputs and the outpt is high , the gate is','NOR','NAND','AND','OR','B'),(79,'The _____________________ pittance the widow receives from the government cannot keep her from poverty ?','Meagre','Indulgent','Meticulous','Magnanimous','a'),(80,'The other boys or henry ________________________ to blame ?','is','are','were','will','a'),(81,'Which of the following is the closest in meaning to the word   , CLOWN ?','idiot','dunce','don','jester','d'),(82,'Find the synonym that is most nearly simillary in meaning to the word : DEBACLE','Catastrophe','Dandy','Corker','Opulence','a'),(83,'choose the phrasal verb that means \"To spend time doing unimportant things  instead do doing necessary things\"','fake out','fall about','fade out ','fall apart','b'),(84,'Which collocation goes with therightly word AWARE ?','rightly','fully','nearly','exactly','b'),(85,'9 balls are to palced in 9 boxes and 5 of the balls cannot fit into 3 small boxes. The number of','18720','18270','17720','12780','c'),(86,'The sum of all 3-digit numbers which leave the remainder 2, when divided by 3, is :','154390','164850','154850','109900','b'),(87,'In how many ways 5 boys and 3 girls can be seated in a row  so that no two girls are together ?','2400',' 7200',' 14400',' 1440','c'),(88,'In a the following question one word is different from the rest. Find out the word which does not belong to the group.','sun','star','moon','sky','d'),(89,'If the following words are arranged in the dictionary order then which will be the last word ?','Dream','Drench','dread','dredge','b'),(90,'As a \"Author is releted to \"Writing\",similarly.  \"Theif is releted \"  to what ? ','To steal','To night','To feel','To wonder','a'),(91,'As a \"Earthquake is releted to \"Earth\",similarly.  \"Thundering is releted \"  to what ?','Fair','Sea','Earth','Sky','d'),(92,' EJOT : KPUZ :: CHMR :  ?',' joty',' hmrw','insx',' lqva','c'),(93,'5 : 625 :: 3 ?','27','81','243','99','b'),(94,'Artist is to paintng  as Senator is to','Attorney','Law','Politician','Constituents','b'),(95,'Number of divisiors of the form 4n + 2 ( n > 0) of the integer 240 is ','4','8','10','3','a'),(96,'If the straight line ax + by + c = 0 always passes through ( 1 ,-2 ) , then a , b , c  are in','A.P','H.P','G.P','NONE','a'),(97,'If the vector 2i - 3j , I + j  - k , and 3i - k from three conterminous edges of a parallelopiped , then the volume of parallelopiped is','8','10','4','14','c'),(98,'The total number of number that can be formed  using the digital 3 , 5 and 7 only if no repetitions are allowed , is','39','1015','15','27','c'),(99,'Find the missing element in the series A , CD , GHI , __________________ , UVWXY','LMNO','MNOP','NOPQ	','OPQR','b'),(100,'The instructor , along with the class , ___________________ angry about the room change .','are','have','has','is','d'),(101,'Which of the following circuit is used as a memory device in computers ?','Flip - Flop','Rectifier','Comparator','All of these','a'),(102,'The minimum number of bits to represent a charcter from ASCII code set is','2','8','5','7','d'),(103,'All digital circuits can be reallized by using only','Exclusive OR gates','Half adders','Mutiplexers','OR gate','b'),(104,'The value of x + x(xx) when x = 2 is:','10','16','18','36','a'),(105,' Kiran is younger than Bineesh by  7  years and their ages are in the respective ratio of  7 : 9.  How old is Kiran?','25','24.5','24','23.5','b'),(106,'The sum of ages of  5  children born at the intervals of  3  years each is  50  years. Find out the age of the youngest child?','6  years','5 years','4  years','3  years','c'),(107,'A is two years older than B who is twice as old as C. The total of the ages of A, B and C is  27 . How old is B? ','10','9','8','7','a'),(108,'A man is  24  years older than his son. In two years, his age will be twice the age of his son. What is the present age of his son?','23  years',' 22 years','21  years','20  years','b'),(109,' The total age of A and B is  12  years more than the total age of B and C. C is how many year younger than A?','10','11','12','13','c'),(110,'Let us play ----- chess','no article','a','an','the','a'),(111,'She wants to become ----- engineer','a','an','the','no Article','b'),(112,'He hopes to join ----- university soon','a','an','the','no Article','a'),(113,'----- Oranges are grown in Nagpur','a','an','the','no article','d'),(114,'----- Pandiyan Express is very popular','a','an','no article','the','d'),(115,'India will become ----- super power shortly ','a','an','the','some','a'),(116,'Ram was ----- best student in the class','a','an','the','no article','c'),(117,'Where is RAM located ? ','Expansion Board','External Drive','Mother Board','All of above','c'),(118,'If a computer has more than one processor then it is known as ?','Uniprocess','Multiprocessor','Multithreaded','Multiprogramming','b'),(119,'If a computer provides database services to other, then it will be known as ?','Web server ','Application server ','Database server ','FTP server ','c'),(120,'Full form of URL is ?','Uniform Resource Locator','Uniform Resource Link','Uniform Registered Link ','Unified Resource Link','a');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-17 16:10:04

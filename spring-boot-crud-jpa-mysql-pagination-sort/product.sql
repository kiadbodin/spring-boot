-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 08, 2022 at 01:00 PM
-- Server version: 10.6.5-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cart`
--

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `productid` int(11) NOT NULL,
  `productname` varchar(50) DEFAULT NULL,
  `productbrand` varchar(50) DEFAULT NULL,
  `productprice` double DEFAULT NULL,
  `productdetail` text DEFAULT NULL,
  `productcdate` timestamp NULL DEFAULT current_timestamp(),
  `productedate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`productid`, `productname`, `productbrand`, `productprice`, `productdetail`, `productcdate`, `productedate`) VALUES
(4, 'iPhone 13 Pro Max 256GB', 'Apple', 39000, NULL, '2022-09-08 04:08:31', NULL),
(5, 'iPhone 14 Pro', 'Apple', 43200, NULL, '2022-09-08 04:09:01', NULL),
(6, 'iPad Pro 12.9', 'Apple', 35200, '<ul><li>จอภาพ Liquid&nbsp;Retina&nbsp;XDR</li><li>จอภาพ Multi‑Touch แบ็คไลท์แบบ Mini‑LED ขนาด 12.9 นิ้ว (แนวทแยง) พร้อมเทคโนโลยี IPS</li><li>ระบบแบ็คไลท์ 2D ที่มาพร้อมโซนหรี่แสงเฉพาะที่แบบเต็มแผงจำนวน 2,596&nbsp;โซน</li><li>ความละเอียด 2732 x 2048<br>ที่ 264 พิกเซลต่อนิ้ว (ppi)</li><li>เทคโนโลยี ProMotion</li><li>จอภาพขอบเขตสีกว้าง (P3)</li><li>การแสดงผลแบบ True&nbsp;Tone</li><li>เคลือบสารกันรอยนิ้วมือ</li><li>จอภาพแบบ Full&nbsp;Lamination</li><li>เคลือบสารกันแสงสะท้อน</li><li>การสะท้อนแสงกลับ 1.8%</li><li>ความสว่าง SDR: สูงสุด 600&nbsp;นิต</li><li>ความสว่าง XDR: สูงสุด 1,000&nbsp;นิต แบบเต็มหน้าจอ และ 1,600&nbsp;นิต ที่ระดับสูงสุด (เฉพาะคอนเทนต์ HDR)</li><li>อัตราส่วนคอนทราสต์ 1,000,000:1</li><li>รองรับ Apple&nbsp;Pencil (รุ่นที่ 2)</li></ul>', '2022-09-08 04:56:47', '2565-09-08 12:50:17'),
(8, 'OPPO Reno8 Z', 'oppo', 12990, '<p>OPPO Reno8 5G</p><p>เซ็นเซอร์ Dual Sony Flagship<br>Ultra Night Video<br>ชาร์จไว 80W SUPERVOOCTM<br>Streamlined Unibody Design ดีไซน์เรียบเนียนไร้รอยต่อ<br>MediaTek Dimensity 1300</p>', '2022-09-08 05:17:52', '2565-09-08 12:47:53'),
(10, 'iPhone 14 Pro Max', 'Apple', 46900, '<h2><strong>iPhone 14 Pro มาถึงแล้ว</strong></h2><p>สั่งซื้อล่วงหน้า 9 ก.ย. เริ่มตั้งแต่เวลา 19‍.‍00&nbsp;น.<br>เริ่มวางจำหน่าย 16 ก.ย.</p><p><strong>เริ่มต้นที่ ฿41,900</strong></p><p><a href=\"https://www.apple.com/th/shop/browse/finance/installment\">มีการผ่อนชำระในอัตราดอกเบี้ย 0%</a></p><p>&nbsp;</p>', '2022-09-08 05:17:59', '2565-09-08 12:46:55'),
(12, 'OPPO Reno8 Pro', 'oppo', 27990, '<h2>OPPO Reno8 Pro 5G</h2><p>Ultra-Clear Imaging Processor: MariSilicon X NPU<br>4K Ultra Night Video<br>80W SUPERVOOCTM<br>Streamlined Unibody Design ดีไซน์เรียบเนียนไร้รอยต่อ<br>MediaTek Dimensity 8100-MAX</p>', '2022-09-08 05:48:07', '2565-09-08 12:48:54'),
(13, 'iPhone 13 ', 'Apple', 24900, '<p><strong>เป้าหมายด้านสิ่งแวดล้อมของเรา</strong><br><br>iPhone 13 และ iPhone 13 mini ไม่มีอะแดปเตอร์แปลงไฟหรือ EarPods ให้มาด้วย ซึ่งเป็นส่วนหนึ่งในความพยายามของเราที่จะไปสู่ <a href=\"https://www.apple.com/th/environment\">ความเป็นกลางทางคาร์บอนภายในปี 2030</a> สิ่งที่มีมาให้ในกล่องได้แก่สาย USB‑C เป็น Lightning ที่รองรับการชาร์จเร็วและใช้งานได้กับอะแดปเตอร์แปลงไฟ USB-C รวมถึงพอร์ตคอมพิวเตอร์ต่างๆ<br><br>เราส่งเสริมให้คุณใช้ซ้ำสาย USB‑A เป็น Lightning รวมถึงอะแดปเตอร์แปลงไฟและหูฟังที่คุณมีอยู่แล้วในตอนนี้ ซึ่งสามารถใช้งานได้กับ iPhone รุ่นต่างๆ เหล่านี้ แต่หากคุณต้องการอะแดปเตอร์แปลงไฟหรือหูฟังของ Apple อันใหม่ ก็มีวางจำหน่ายให้เลือกซื้อได้</p>', '2022-09-08 05:51:47', NULL),
(14, 'iPhone 14 Pro Max', 'Apple', 44900, '<h2><strong>iPhone 14 Pro มาถึงแล้ว</strong></h2><p>สั่งซื้อล่วงหน้า 9 ก.ย. เริ่มตั้งแต่เวลา 19‍.‍00&nbsp;น.<br>เริ่มวางจำหน่าย 16 ก.ย.</p><p><strong>เริ่มต้นที่ ฿44,900</strong></p><p><a href=\"https://www.apple.com/th/shop/browse/finance/installment\">มีการผ่อนชำระในอัตราดอกเบี้ย 0%</a></p>', '2022-09-08 05:52:37', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`productid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `productid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

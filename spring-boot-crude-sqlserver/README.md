<img src="https://seeklogo.com/images/M/microsoft-sql-server-logo-96AF49E2B3-seeklogo.com.png" width="150"/>

# spring boot connect sqlserver
# วิธีการตั้งค่าเปิดพอร์ตเพื่อให้ MS SQL Server เพื่อให้สามารถเชื่อมต่อกับภายเครื่องได้ หรือ บน Server 
ดูตัวอย่าง <a href="https://docs.microsoft.com/th-th/sql/database-engine/configure-windows/configure-a-server-to-listen-on-a-specific-tcp-port?view=sql-server-2017"> TCP PORT </a>
# ตัวอย่าง
ในตัวอย่างนี้จะใช้ JpaRepository เป็นตัวดำเนินการ sql query ข้อมูล โดยไม่ต้องเขียนคำสั่ง  insert , update ,delete ของ statement sql
* การเพิ่ม Add
* แก้ไข  Update
* ลบข้อมูล Delete

# เริ่มต้นใน Eclipse ดังนี้
1. กำหนด Config ใน application.properties
2. กำหนด dependencies ในไฟล์ pom.xml  
3. เขียน Entity ในของ Table ให้ตรงกับชื่อ ตารางใน sqlserver
4. เขียน JpaRepository โดยสร้าง Interface ของ Repo เชื่อมต่อ JpaRepository ในแพจเกจ Repository
5. เขียน Service ในการเรียกใช้ Interface Repository กำหนด method ต่างๆ เช่น Add , findAll, delete เป็นต้น
6. เขียน Controller เพื่อกำหนด Mapping path url
7. รัน Project ทดสอบการใช้งาน
# Edit application.properties for connect  MS SQL SERVER EXPRESS your computer
![set utf8 sqlserver-1](https://user-images.githubusercontent.com/7127833/190330872-680aeb5f-be48-4854-984f-9205ede87207.PNG)

# Create database name cart in MS SQL SERVER EXPRESS or import cart.sql
![Inkedset utf8 sqlserver](https://user-images.githubusercontent.com/7127833/190332151-363ec538-32c6-4d34-81ab-bf5acdd3a609.jpg)

# Step 1 show product
![spring-boot-cart-view-3](https://user-images.githubusercontent.com/7127833/190327741-02e665c9-be31-42cb-9d76-c07e1c31d858.PNG)
# Step 2 Add product
![spring-boot-cart-view-4](https://user-images.githubusercontent.com/7127833/190328642-6238a278-4446-4cba-8b43-a1267f7cb800.PNG)

# Step 3 Edit product
![spring-boot-cart-view-5](https://user-images.githubusercontent.com/7127833/190328664-0e19e14b-d0f6-47b8-a60e-45de06e3a59d.PNG)

# Step 4 Delete product
![spring-boot-cart-view-6](https://user-images.githubusercontent.com/7127833/190328670-8889bc56-e15b-4810-aeda-233a9a4c5908.PNG)


1. Run the application and enter the url    http://localhost:8080/saveItems
   It is for saving static products in database using Postman client. I have attached Postman collection inside the project for storing static products.
   Here I have used MySQL database and database name is "demo4".

   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.datasource.url=jdbc:mysql://localhost:3306/demo4?useSSL=false
   spring.datasource.username=root
   spring.datasource.password=root

2. Now open the url    http://localhost:8080
   It fetches the list of products from the database in the Home page.

3. Click on Add To Cart button for what ever the product you want to send to the cart. It uses this url  http://localhost:8080/getProduct/1
   Based on the product it will find the id and it will send to the cart page. At a time it will add one product to the cart.

4. Inside cart page it fetches what are the products we have clicked on Add To Cart button.

   Continue Shopping Button :
   If you want to add another product then click on this button. It redirects to the Home page by using this url    http://localhost:8080

   Quantity input box :
   We can add quantity  based on the maximum quntity stored in the database. If you give more than available quantity then it will show the error message.

   Delete Button :
   It deletes what ever the product you wants to delete. It uses this url   http://localhost:8080/deleteProduct/2
   After deleting it fetches automatically list of products in the cart table.

   Update Cart Button :
   Afert ading products to cart select the quantity of the products. Based on the quantity it calculates Total, SubTotal, TotalTax and GrandTotal and
   these values filled in the corresponding input boxes which declared as readonly input boxes.
   Without adding quantity if you directly click update cart button then it will show the alert box message.

   Next Button :
   It sends you to the user details page. With out adding quantity if you click on Next button than it will show the error message. After adding quantity
   if you click on next button it will show the alert box message.

4. In user datails page all are required fields.
   Validation fields are
   First Name : FirstName size should be between 2 to 256
   Last Name  : LaststName size should be between 2 to 256
   Email      : Valid Email validation here I have used regular expression  "^[a-zA-Z0-9_!#$%&'*+=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"
   Mobile Number : Must be Indian mobile number here I have used regular expression  "^(?:(?:\+|0{0,2})91(\s*|[\-])?|[0]?)?([6789]\d{2}([ -]?)\d{3}([ -]?)\d{4})$"
   Zip Code   : ZipCode should be 6 digits

   Radio Button : Click this button if you want Shipping Address same as Billing Address.
   Back To Cart Button : It redirects to the cart page. here you can get list of products in the cart page by using this url   http://localhost:8080/backToCart

5. Click on save button to save total user object to the database it uses this url  http://localhost:8080/saveUser. Then it takes you to the success-page.
   Cancel button is for clearing all fields in the user details page.
   After saving user object to the database it will send mail to the user email which is given in the user details page. Mail sends from "suneelpamujula@gmail.com" with subject "Order Shipped!".
   This mail contains order details. This order details are displayed in a email-template.

6. Click on Home button to again redirect to the home page it uses this url   http://localhost:8080

7. I have created JUnit Tests for all Service and Repository methods by using JUnit Mockito.
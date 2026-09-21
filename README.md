# Vending Machine Controller Simulator

A simple *Java-based Vending Machine Controller Simulator* that demonstrates the basic working of an automated vending machine through a console-based interface.

The simulator allows users to view available products, select a product, make a payment, receive change, and view sales statistics.

## Features

* Display available products
* Display product prices and stock
* Select a product
* Check product availability
* Accept user payment
* Handle insufficient payment
* Calculate and display change
* Update product stock after purchase
* Track products sold
* Display sales statistics
* Handle invalid product selections
* Handle invalid payment amounts
* Exit the vending machine safely

## Technologies Used

* *Java*
* *Java Scanner* for user input
* Console-based user interface

## How It Works

The simulator follows a simple sequence:

text
Display Products
       ↓
Select Product
       ↓
Check Availability
       ↓
Enter Payment
       ↓
Verify Payment
       ↓
Dispense Product
       ↓
Calculate Change
       ↓
Update Stock
       ↓
Display Transaction Result


## Products

The simulator contains the following sample products:

| ID | Product    | Price | Initial Stock |
| -: | ---------- | ----: | ------------: |
|  1 | Chips      |   ₹20 |            10 |
|  2 | Chocolate  |   ₹30 |             8 |
|  3 | Soft Drink |   ₹40 |            10 |
|  4 | Biscuit    |   ₹15 |            12 |
|  5 | Juice      |   ₹25 |            10 |

## Main Menu

text
==============================================
       VENDING MACHINE CONTROLLER
==============================================

--------------- MAIN MENU ----------------
1. Display Products
2. Buy Product
3. Sales Statistics
4. Exit
------------------------------------------
Enter your choice:


## Example Transaction

If the user selects Chocolate costing ₹30 and inserts ₹50:

text
You selected: Chocolate
Price: ₹30.00

Insert money: ₹50

==============================================
           TRANSACTION SUCCESSFUL
==============================================
Product       : Chocolate
Price         : ₹30.00
Amount Paid   : ₹50.00
Change        : ₹20.00
----------------------------------------------
Please collect your Chocolate.
Thank you!
==============================================


## Error Handling

The simulator handles common situations such as:

* Invalid product ID
* Product out of stock
* Insufficient payment
* Zero or negative payment amount

Example:

text
Enter product ID: 8

Invalid product ID!


## Sales Statistics

The simulator keeps track of the number of products sold and displays basic sales information.

Example:

text
==============================================
             SALES STATISTICS
==============================================
Total items sold: 3
Different products sold: 2
Average items sold per product: 0.60

Items sold by product:
Chips : 1
Chocolate : 2
Soft Drink : 0
Biscuit : 0
Juice : 0
==============================================


## Project Structure

text
Vending-Machine-Controller-Simulator/
│
├── VendingMachine.java
└── README.md


## Requirements

* Java Development Kit (JDK)
* Any Java-supported IDE or text editor
* Command Prompt / Terminal

## How to Run

### 1. Clone the repository

bash
git clone <your-repository-url>


### 2. Open the project directory

bash
cd Vending-Machine-Controller-Simulator


### 3. Compile the program

bash
javac VendingMachine.java


### 4. Run the program

bash
java VendingMachine


## Project Objectives

* Simulate the basic operation of a vending machine.
* Manage product selection and availability.
* Process user payments and calculate change.
* Maintain product stock information.
* Track basic sales statistics.
* Demonstrate problem-solving and programming concepts through a practical application.

## Future Improvements

Possible future enhancements include:

* Graphical user interface
* Digital/UPI payment simulation
* Administrator inventory management
* Receipt generation
* Transaction history
* More products and categories
* Connection with physical vending machine hardware

## Author
Akash Ganti

*Your Name*

If you found this project useful, feel free to ⭐ the repository.**

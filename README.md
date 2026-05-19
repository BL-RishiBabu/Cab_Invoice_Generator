# 🚕 Cab Invoice Generator

> The cab service is a subscription-based Cab Service, where the customer books a cab, and pays the bill at the end of the month.

---

## 🚀 Steps & Implementation

### 📍 Step 1 - Calculate Fare
Given distance and time, the invoice generator should return the total fare for the journey.

* **Cost** - Rs. 10 per kilometer + Rs. 1 per minute.
* **Minimum Fare** - Rs. 5

### 🛣️ Step 2 - Multiple Rides
The Invoice Generator should now take in multiple rides, and calculate the aggregate total for all.

### 🧾 Step 3 - Enhanced Invoice
The Invoice Generator should now return the following as a part of the invoice:
* **Total Number of Rides**
* **Total Fare**
* **Average Fare Per Ride**

### 👤 Step 4 - Invoice Service
Given a user id, the Invoice Service gets the List of rides from the `RideRepository`, and returns the Invoice.

### 🌟 Step 5 - Premium Rides (Bonus)
The Cab Agency now supports 2 categories of rides:

| Category | Rate per km | Rate per minute | Minimum fare |
| :--- | :--- | :--- | :--- |
| **Normal Rides** | Rs. 10 | Rs. 1 | Rs. 5 |
| **Premium Rides** | Rs. 15 | Rs. 2 | Rs. 20 |

---
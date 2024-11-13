# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As a hospital adminstrator or healthcare provider, <br> 
> I want to efficiently track and manage patient data, including current department and health conditions, <br> 
> so that I can ensure patients are placed in appropriate departments and their data is up-to-date for better healthcare management. 

## Dataset 

The project uses two primary data files to initialize patient and department data:
- **patient_names.txt:** This file contains a list of 50 patient names, each on a new line. The data type is String. These names are loaded into an array in the PatientTracker program.
- **departments_txt:** This file contains a list of hospital departments, including ER, ICU, General Ward, and Pediatrics. The data type is String. This data is used to assign each patient to a specific department initially.

Both files are read by the program to initalize data arrays, making it possible to manage patient assignments and movements.

## UML Diagram 

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README. 

![UML Diagram for my project](nameOfImageFileHere.png) 

## Description 

The **Patient Tracking System** is designed to help hospitals keep track of patient information by using a **1D Array** to store details like patient names and departments. Patient data is loaded from **text files**, with each **element** in the array holding a different patient's information. The program lets users **move** patients between departments and view all of their details. This project covers important coding concepts like working with arrays and reading from files, making it easier for healthcare staff to manage patient data in one place.
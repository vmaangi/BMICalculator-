# BMICalculator-


---

# ⚖️ BMI Calculator – Java Program

This Java console application calculates the **Body Mass Index (BMI)** based on the user's weight (in pounds) and height (in meters), then provides a health interpretation based on the result.

## 📌 Features

* Prompts the user to input:

  * Weight in pounds
  * Height in meters
* Converts weight to kilograms
* Calculates BMI using the standard formula
* Provides interpretation:

  * Underweight
  * Normal weight
  * Overweight
  * Obese

## 🧮 Formula Used

* **Weight (kg)** = Weight (lbs) × 0.453592
* **BMI** = Weight (kg) ÷ (Height (m))²

### 📊 BMI Categories

| BMI Range   | Category      |
| ----------- | ------------- |
| < 18.5      | Underweight   |
| 18.5 – 24.9 | Normal weight |
| 25 – 29.9   | Overweight    |
| ≥ 30        | Obese         |

## 💻 How to Run

1. Save the file in a folder named `day4` as `bmiCalulator.java`.
2. Open a terminal or command prompt and navigate to the folder.
3. Compile and run the program:

```bash
javac day4/bmiCalulator.java
java day4.bmiCalulator
```

4. Follow the prompts to enter weight and height.

## 🧾 Sample Output

```
Enter your weight in pounds
150
Enter your height in meters
1.65
Your BMI is 24.96
You have a normal weight.
```

## 🛠 Requirements

* Java Development Kit (JDK) 8 or later
* Basic Java knowledge

## 📁 File Structure

```

```

## 🧠 Author

Developed as a simple practice project to demonstrate Java basics such as user input, mathematical calculations, and conditional logic.

---


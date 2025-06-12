# finch-robot

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Program basics in SNAP!</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    |             |
|    ❌     | Develop Code |             |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

I wanted to serve people **Oreos** as a prize for participating!
</details>

---

### Design Cycle
<img src="design_cycle.png" alt="design cycle" width="300" height="300">

###### Include commentary on your experience with the design cycle during this project

---

### Code to Highlight
```java
public static void followLine(Finch f) {
	int left = f.getLine("L");
	int right = f.getLine("R");
	
	System.out.println("left: " + left + " right: " + right);
	if (left < 90) {
		f.setMotors(0, 10);
	} else if (right > 90) {
		f.setMotors(10, 0);
	} else {
		f.setMotors(10, 10);
	}
	f.pause(.1);
}
```

---

### What was your motivation?
When we start the creation of the 3D modification for the finch, we 

### What did you learn?
While coding the robot, we as a group established the fact that we wanted to utilize WASD keybinds in order to enable the finch's movement. We collectly agreed to have this be our primary goal for the finch, because we wanted the ability to have free control of the robot while it was active, and it felt too much off a hassle to constantly change the code if we wanted the flinch to perform a different task. We also thought that it would've been a suitable implementation to add onto the flinch, considering the fact that our 3D printed modification would only had a decorative purpose.

  
### What makes your project stand out?
jswing keyevent

We used 

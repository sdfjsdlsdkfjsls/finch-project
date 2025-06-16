# finch-robot
<details>
<summary>heh</summary>

<img src="https://preview.redd.it/does-anyone-know-the-source-of-the-zena-cat-images-outside-v0-atue5kweyahd1.jpeg?width=640&crop=smart&auto=webp&s=84a89e38704c18b7b622d6bb07bd301e5e76b552" width="250">

</details>
        
### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | *Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Program basics in SNAP!</li><li>Setup local developing environment to code in Java</li></ul>*|
|    ✅     | Concept And Idea | *Develop the idea for the finch robot*|
|    ✅     | 3D Design    | *Design a 3D model that allows the storage of coin-like objects*|
|    ✅     | Develop Code | *Develop a code to allow the finch robot to complete a task that is asked for it*|

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>
        
When we first originally started the creation of the 3D modification for the finch, we orginally intended on making the robot carry the 3D model of a character from a popular game made in Korea, known as "Limbus Company". We decided on this idea because the majority of our group members played this game, and we wanted to have something that was meaningful to us be incorporated into our project. However, after a couple weeks into the project, we changed our minds due to the complexity of the design of the character that we would have to model. Furthermore, the idea was later replaced by another idea where we would have a container hold a bunch of coins engraved with the logo of the same game, so we could still honor the original idea and its origins.

Before we started coding the robot, we as a group established the fact that we wanted to utilize WASD keybinds in order to enable the finch's movement. We collectly agreed to have this be our primary plan for the finch, because we wanted the ability to have free control of the robot while it was active, and it felt too much of a hassle to constantly change the code if we wanted the flinch to perform a different task. We also thought that it would've been a suitable implementation to add onto the flinch, considering the fact that our 3D printed modification would only had a decorative purpose.

</details>

---

### Design Cycle

First, we decided what we wanted to model in 3D for our finch modification. After trying to model it for a while, we changed our plans and started modeling a different object. Next, we choose what we wanted our finch to do, and proceeded with programming the robot. However when we tried to install the required software for the robot, we struggled greatly. So we had someone start coding on Snap as an outline, while the rest of the group tried figuring out how to get the software installed. After successfully installing the software, we got straight to creating the program. While creating a program, there was a mix of testing, implementation, and researching. However when we finished, we ended up quite happy with the end results.

---

### Code to Highlight
```java
        frame.addKeyListener(new KeyAdapter() {
    		boolean sprintToggle = false;
            	@Override
            	public void keyPressed(KeyEvent e) {
	            		int left = 0;
	            		int right = 0;
	            		if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
	            			sprintToggle = true;
	            		}
	                	if (e.getKeyCode() == KeyEvent.VK_W) {
	                    	left = 25;
	                    	right = 25;
	                	} else if (e.getKeyCode() == KeyEvent.VK_S) {
	                   		left = -25;
	                   		right = -25;
	                	} else if (e.getKeyCode() == KeyEvent.VK_A) {
	                        left = -25;
	                        right = 25;
	                    } else if (e.getKeyCode() == KeyEvent.VK_D) {
	                        left = 25;
	                        right = -25;
	                    }
	                    if (sprintToggle) {
	                    	f.setMotors(3*left,3*right);
	                    }
	                    else {
	                    	f.setMotors(left,right);
	                    }
            	}

            
            	@Override
            	public void keyReleased(KeyEvent e) {
            		if (e.getKeyCode() == KeyEvent.VK_W ||
            			e.getKeyCode() == KeyEvent.VK_S ||
            			e.getKeyCode() == KeyEvent.VK_A ||
            			e.getKeyCode() == KeyEvent.VK_D) {
                		f.stop();
                	} 
            		if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
            			sprintToggle = false;
            		}
            	}
        });

```

---

### What was your motivation?
Throughout the class year, I'm fairly certain our teacher and our class thought of us as lazy or a bunch of slackers. For the most part, that may be true, however, we wanted to make up for it with this project by doing something no one else did before. We wanted to prove them wrong by trying our hardest to learn new things, and develop something that they would never be brave enough to challenge. We as a class never learned how to implement keybinds for our code, and our group wanted to use this as an opportunity to learn how, and blow everyone away.

### What did you learn?
With the usage of KeyEvent, the Jswing library allows the finch to detect key presses that would trigger movement by overriding the base function of keyPressed, and would allow the code to detect user inputs. To prevent the user input from looping infinitely, we used an override in the keyReleased function which is also a part of KeyEvents. By adding the keyRelease function, the finch is able to detect when *WASD* is released and would stop the code when it is. 

By using the KeyEvent library, we were able to bind the keys *w*, *a*, *s*, and *d*. Despite this, when the testing of movement, we noticed the difficulty in control of the movement robot because of it's speed. We weren't able to lower the speed or else it would feel too slow, and we weren't able to keep it high or else it would feel too hard to control. We fixed this issue by creating a *shift* keybind that would serve as a toggle to switch between high and low speeds.

The *shift* keybind wasn't included in keyReleased, and instead, a segment of code runs so it can check if the toggle is enabled or not enabled. When it is enabled, the power of the motors would be amplified and the overall speed of the finch's movement would be increased.

### What makes your project stand out?
By using WASD keybinds, we did something no one else decided to do, because everyone else was told to have a set action for their robot. By having a set action for their robot, they aren't able to do things the moment that they want them to, and they have to change their code directly if they want their robots to do something else. We however, are able to have the freedom to freely control our robot because the WASD keybinds will trigger movement for the robot the moment that we press them.

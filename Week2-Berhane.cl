International Allegro CL Free Express Edition
10.1 [32-bit Windows] (Jan 9, 2019 10:44)
Copyright (C) 1985-2019, Franz Inc., Oakland, CA, USA.  All Rights Reserved.

This development copy of Allegro CL is licensed to:
   Allegro CL 10.1 Express user

Loaded options from C:\Users\sirk12\Documents\allegro-ide-options.cl.

;; Optimization settings: safety 1, space 1, speed 1, debug 2.
;; For a complete description of all compiler switches given the current optimization settings evaluate (EXPLAIN-COMPILER-SETTINGS).

[changing package from "COMMON-LISP-USER" to "COMMON-GRAPHICS-USER"]
CG-USER(1): 
; Autoloading for ACL-SOCKET:MAKE-SSL-CLIENT-STREAM:
; Fast loading C:\acl10.1express\code\ssl.002
;;; Installing ssl patch, version 2.
CG-USER(1): (defun hello () (write-string "Hello, Everyone!"))
HELLO
CG-USER(2): (hello)
Hello, Everyone!
"Hello, Everyone!"
CG-USER(3): (defun goodbye () (write-string "bye"))
GOODBYE
CG-USER(4): (goodbye)
bye
"bye"
CG-USER(5): (defun middle-name (name) (car (cdr name)))
MIDDLE-NAME
CG-USER(6):  (middle-name '(Sirak Mekonnen Berhane))
MEKONNEN
CG-USER(7): (defun second-of-second (listOfLists)
              (car (cdr listOfLists)))
SECOND-OF-SECOND
CG-USER(8): (second-of-second '((abc)(1x)(ef)))
            
(1X)
CG-USER(9): 
CG-USER(9): 
CG-USER(9): (defun repeater (numof-times print-what);declare function
            (setf x 1)
            (dotimes (counter numof-times)
            (write x)
            (write print-what)
            (terpri)
            (incf x))
              )
REPEATER
CG-USER(10): (repeater 3 '.AI);call function with parameters
1.AI
2.AI
3.AI
NIL
CG-USER(11): (defun repeater (numof-times)
             (setf x 1)
             (dotimes (counter numof-times)
             (write x)
             (write '.AI)
             (terpri)
             (incf x))
    )

REPEATER
CG-USER(12): 
CG-USER(12): (repeater 4)
1.AI
2.AI
3.AI
4.AI
NIL
CG-USER(13): (defun adder()
(princ "PleaseEnter Four Numbers: ") ;Ask input
(setq w (read)) ;set variables
(setq x (read))
(setq y (read))
(setq z (read))
(setq sum (+ w x y z)) ;Calculate sum

(princ "SUM: ")   
(write sum)) ;print sum
(adder) ;call function
ADDER
CG-USER(14): PleaseEnter Four Numbers: 5 4 3 2
SUM: 14
14
CG-USER(15): 
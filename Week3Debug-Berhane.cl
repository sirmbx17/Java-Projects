International Allegro CL Free Express Edition
10.1 [32-bit Windows] (Apr 7, 2019 15:44)
Copyright (C) 1985-2019, Franz Inc., Oakland, CA, USA.  All Rights Reserved.

This development copy of Allegro CL is licensed to:
   Allegro CL 10.1 Express user

Loaded options from C:\Users\sirk\Documents\allegro-ide-options.cl.

;; Optimization settings: safety 1, space 1, speed 1, debug 2.
;; For a complete description of all compiler switches given the current optimization settings evaluate (EXPLAIN-COMPILER-SETTINGS).

[changing package from "COMMON-LISP-USER" to "COMMON-GRAPHICS-USER"]
CG-USER(1): 
; Autoloading for ACL-SOCKET:MAKE-SSL-CLIENT-STREAM:
; Fast loading C:\acl10.1express\code\ssl.002
;;; Installing ssl patch, version 2.
;   Foreign loading libeay32.dll.
;   Foreign loading ssleay32.dll.
;   Foreign loading sys:aclissl.dll.
; Fast loading C:\Users\sirk\Downloads\Week3Code-Berhane.fasl
CG-USER(1): (setf min '((a b c) (b c) (c d)))


((A B C) (B C) (C D))
CG-USER(2): 
CG-USER(2): (shortest-path 'a 'd min)
(A C D)
CG-USER(3): (shortest-path 'a 'd min)
(A C D)
CG-USER(4): (setf min '((a b) (b c) (c d)))
((A B) (B C) (C D))
CG-USER(5): (shortest-path 'a 'd min)
(A B C D)
CG-USER(6): (setf min '((x y z)(x y)(x w)))
((X Y Z) (X Y) (X W))
CG-USER(7): (shortest-path 'w 'z min)
NIL
CG-USER(8): (setf min '((x y z)(y z)(x w)))
((X Y Z) (Y Z) (X W))
CG-USER(9): (shortest-path 'a 'd min)
NIL
CG-USER(10): (shortest-path 'w 'z min)
NIL
CG-USER(11): (setf min '((w x)(x y)(y z))); disregard the previous definitions of min in regards to figure 2 
((W X) (X Y) (Y Z))
CG-USER(12): (shortest-path 'w 'z min)

 
CG-USER(12): (shortest-path 'w 'z min)
(W X Y Z)
CG-USER(13): 
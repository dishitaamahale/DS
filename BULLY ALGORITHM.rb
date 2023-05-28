BULLY ALGORITHM

class

    state of processes ka array
    int coordinator

    up
        if up, print already up
        else
            up karo
            saare P ko msg karo that up wala P is taking elections
            up+1 wale pe for loop
                if alive
                    send alive msg
                    break


    down
        if down, print down
        else down kardo

    
    msg
        if up
            check if coordinator, if yes, print
            else
                if C ka state false
                    print Pmsg election lega
                    print to all Pmsg
                    peeche se for loop
                        if alive    
                            print, break
        else
            print P down



    main
        take choice
        set saare process to true(alive)
        do while 
            print menu
            switch case
                (1) up
                    take process jo up karna hai
                    see if coordinator, if yes up
                    else up(up)
                (2) down
                    take process jo down karna hai
                    down(down)
                (3) message
                    take process jo msg karega
                    msg(msg)
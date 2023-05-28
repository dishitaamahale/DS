RING ALGORITHM

class

    n //no. of P
    coordinator
    P state ka array


    constructor
        set state of all P as true
        set coordinator as n-1
    
    deactivate process()
        if already inactive, print
        else set

    view ring()
        for loop print all P

    election(process id)
        id=id-1
        current_coordinator = id
        token = (id+1)%n
        while(token!=id){
            if(P is alive){
                if(token>current_coordinator)
                    current_coordinator=token
            }
            token = (token+1)%n
        }
        coordinator=current_coordinator


    ping coordinator(id)
        if not alive, print
        if id=coordinator
            check if alive, print
            check if not alive, print
        if coordinator not alive, print
            election(id)
        else print alive

    main
        take choice
        while
            print menu
            switch
                (1) Deactivate a process
                    take input
                    call function
                (2) Ping coordinator
                    take input
                    call function
                (3) view ring
                (4) election
                    take P input
                    call function
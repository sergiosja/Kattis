[kattio].

main :-
    repeat,
    read_int(X), read_int(Y),
    (X == end_of_file ;
     solve(X, Y),
     fail
    ).

solve(X, Y) :-
    K is Y - 1,
    Z is X * K + 1,
    write(Z), nl.

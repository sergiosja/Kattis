solve :: String -> String -> String
solve "" y = y
solve x "" = x
solve a@(x:xs) b@(y:ys) =
    if x < y then x : solve xs b
    else y : solve a ys

main :: IO ()
main = do
    x <- getLine
    y <- getLine
    putStrLn $ solve x y
solve :: String -> String
solve s =
    case ab == c of
        True -> "correct!"
        False -> "wrong!"
    where ints = map read $ words s :: [Int]
          ab = sum $ init ints
          c = last ints

main :: IO ()
main = do
    input <- getContents
    putStrLn $ solve input

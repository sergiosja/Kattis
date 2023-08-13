solve :: String -> String -> String
solve [] curr = reverse curr
solve (x:[]) curr = reverse (x:curr)
solve (x:y:ys) curr
    | x == y = solve (y:ys) curr
    | otherwise = solve (y:ys) (x:curr)

main :: IO ()
main = do
    input <- getContents
    putStrLn $ solve input ""

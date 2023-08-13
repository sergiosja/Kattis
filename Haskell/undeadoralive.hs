import Data.List (isInfixOf)

solve :: String -> String
solve x
    | isInfixOf ":)" x && isInfixOf ":(" x = "double agent"
    | isInfixOf ":)" x = "alive"
    | isInfixOf ":(" x = "undead"
    | otherwise = "machine"

main :: IO ()
main = do
    input <- getContents
    putStrLn $ solve input

import qualified Data.Map as Map

checkNicknames :: Int -> Map.Map String Int -> IO ()
checkNicknames n map
    | n > 0 = do
        name <- getLine
        putStrLn $ show $ Map.findWithDefault 0 name map
        checkNicknames (n-1) map
    | otherwise = pure ()

addPrefix :: String -> Map.Map String Int -> Map.Map String Int
addPrefix "" map = map
addPrefix name map =
    addPrefix (init name) $ Map.insertWith (+) name 1 map

readNames :: Int -> Map.Map String Int -> IO (Map.Map String Int)
readNames 0 map = pure map
readNames n map = do
    name <- getLine
    readNames (n-1) (addPrefix name map)

main :: IO ()
main = do
    n <- readLn
    dict <- readNames n Map.empty
    m <- readLn
    checkNicknames m dict

if [ -d ./script ] ; then
  for file in script/*.js; do
    echo "executing script $file"
    mongo 'mongodb+srv://@localhost:27017' $file
  done
fi 
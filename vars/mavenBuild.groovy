def call()
{

echo " performing a maven build"
mvn 'clean package'
echo "build is completed"
}

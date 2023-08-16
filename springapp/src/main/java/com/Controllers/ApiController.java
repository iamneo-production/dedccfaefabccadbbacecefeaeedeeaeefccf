public class ApiController {
    public ResponseEntity<String> getData()
	{
		return ResponseEntity.status(200).body("WELCOME");
	}
}

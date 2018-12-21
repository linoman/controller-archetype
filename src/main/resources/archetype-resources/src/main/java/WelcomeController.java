package ${groupId};

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bigle.conversion.entities.Response;
import com.bigle.conversion.exceptions.ApiError;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@EnableAutoConfiguration
public class WelcomeController {

	@ApiOperation(value = "Welcome", notes = "Welcome server", response = Response.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Response.class),
			@ApiResponse(code = 400, message = "Bad Request", response = ApiError.class),
			@ApiResponse(code = 404, message = "Not Found", response = ApiError.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = ApiError.class) })
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	String home() {
		return "Ok";
	}
}
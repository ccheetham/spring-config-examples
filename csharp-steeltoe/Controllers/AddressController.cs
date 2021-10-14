using AddressService.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Options;

namespace AddressService.Controllers
{

    [ApiController]
    [Route("/")]
    public class AddressController : ControllerBase
    {
        private AddressServiceConfiguration AddressServiceConfiguration { get; set; }

        public AddressController(IOptionsSnapshot<AddressServiceConfiguration> configuration)
        {
            AddressServiceConfiguration = configuration.Value;
        }

        [HttpGet]
        [Route("me")]
        public IActionResult GetMe()
        {
            return Ok(AddressServiceConfiguration.Me);
        }

        [HttpGet]
        [Route("myaddresses")]
        public IActionResult GetMyAddresses()
        {
            return Ok(AddressServiceConfiguration.MyAddresses);
        }

        [HttpGet]
        [Route("addressbook")]
        public IActionResult GetAddressBook()
        {
            return Ok(AddressServiceConfiguration.AddressBook);
        }
    }
}

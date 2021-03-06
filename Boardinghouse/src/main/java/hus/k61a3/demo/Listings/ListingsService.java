package hus.k61a3.demo.Listings;

import hus.k61a3.demo.home.domains.ConfigHome;
import hus.k61a3.demo.home.domains.Room;
import hus.k61a3.demo.home.repositories.FeedbackRepository;
import hus.k61a3.demo.home.repositories.HomeRepository;
import hus.k61a3.demo.home.repositories.RoomRepositoriy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class ListingsService {
    @Autowired
    private HomeRepository homeRepository;
    @Autowired
    private RoomRepositoriy roomRepositoriy;

    public void displayListingsPage(Model model){
        model.addAttribute("home",getHomeData());
        model.addAttribute("rooms", findAllRooms());
    }

    private ConfigHome getHomeData(){
        return homeRepository.getOne(1);
    }

    private List<Room> findAllRooms(){
        return (List) roomRepositoriy.findAll();
    }
}

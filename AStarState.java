
 import java.util.*;

public class AStarState
{
  public static void main(String[] args) {
    private Map2D map;
    private Map<Location, Waypoint> open_waypoints = new HashMap<Location, Waypoint> ();
    private Map<Location, Waypoint> closed_waypoints  = new HashMap<Location, Waypoint> ();

    public  AStarState(Map2D map){
        if (map == null)
            throw new NullPointerException("map cannot be null");
        this.map = map;
    }
    {
        return map;
    }
    public Waypoint getMinOpenWaypoint()
    {
      if (numOpenWaypoints() == 0)
                  return null;
        Set open_waypoint_keys = open_waypoints.keySet();
        Iterator i = open_waypoint_keys.iterator();
        Waypoint best = null;
        float best_cost = Float.MAX_VALUE;

        while (i.hasNext())
        {
            Location location = (Location)i.next();
            Waypoint waypoint = open_waypoints.get(location);
            float waypoint_total_cost = waypoint.getTotalCost();

            if (waypoint_total_cost < best_cost)
            {
                best = open_waypoints.get(location);
                best_cost = waypoint_total_cost;
            }
}
        return best;
    }

    public boolean addOpenWaypoint(Waypoint newWP)  {
        Location location = newWP.getLocation();
        if (open_waypoints.containsKey(location))
      {
            Waypoint current_waypoint = open_waypoints.get(location);
            if (newWP.getPreviousCost() < current_waypoint.getPreviousCost())
            {
                open_waypoints.put(location, newWP);
                return true;
            }
            return false;
        }
        open_waypoints.put(location, newWP);
        return true;
    }
    {
        return open_waypoints.size();
    }
    public void closeWaypoint(Location loc)  {
        Waypoint waypoint = open_waypoints.remove(loc);
        closed_waypoints.put(loc, waypoint);
    }
    public boolean isLocationClosed(Location loc);
    {
        return closed_waypoints.containsKey(loc);
    }
}

import java.util.ArrayList;
public class GPSdriver
{
    public static void main (String args[])
    {
        GPS trail = new GPS();
        System.out.println("\nTrail A");
        System.out.println(trail);
        System.out.println("Distance " + trail.getLength());
        System.out.println("difficulty " + trail.isDifficult(0, trail.Trail.size()-1));
        System.out.println("level " + trail.LevelTrailSegment(0, trail.Trail.size()-1));
        System.out.println("difficulty 3-4 " + trail.isDifficult(3, 4));
        System.out.println("level 5-6 " + trail.LevelTrailSegment(5, 6));

        trail.addmarker(new markers(13,100)	);
        System.out.println("\nTrail B");
        System.out.println(trail); 
        System.out.println("Distance " + trail.getLength());
        System.out.println("difficulty " + trail.isDifficult(0, trail.Trail.size()-1));
        System.out.println("level " + trail.LevelTrailSegment(0, trail.Trail.size()-1));
        System.out.println("difficulty 3-4 " + trail.isDifficult(3, 4));
        System.out.println("level 5-6 " + trail.LevelTrailSegment(5, 6));

        ArrayList<markers> randommarkers = new ArrayList<markers>();
        randommarkers.add(new markers(1,10));
        randommarkers.add(new markers(2,11));
        randommarkers.add(new markers(3,12)); 
        randommarkers.add(new markers(4,13));
        randommarkers.add(new markers(5,14));
        randommarkers.add(new markers(6,15));
        randommarkers.add(new markers(7,16));
        randommarkers.add(new markers(8,17));
        randommarkers.add(new markers(9,18));
        GPS PlainTrail = new GPS(randommarkers);
        System.out.println("\nPlainTrail");
        System.out.println(PlainTrail); 
        System.out.println("Distance " + PlainTrail.getLength());
        System.out.println("difficulty " + trail.isDifficult(0, trail.Trail.size()-1));
        System.out.println("level " + trail.LevelTrailSegment(0, trail.Trail.size()-1));
        System.out.println("difficulty 3-4 " + trail.isDifficult(3, 4));
        System.out.println("level 5-6 " + trail.LevelTrailSegment(5, 6));

        ArrayList<markers> newMarkers = new ArrayList<markers>();
        newMarkers.add(new markers(1,100));
        newMarkers.add(new markers(2,200));
        newMarkers.add(new markers(3,300)); 
        newMarkers.add(new markers(4,400));
        newMarkers.add(new markers(5,500));
        newMarkers.add(new markers(6,600));
        newMarkers.add(new markers(7,700));
        newMarkers.add(new markers(8,800));
        newMarkers.add(new markers(9,900));
        GPS MountainTrail = new GPS(newMarkers);
        System.out.println("\nMountainTrail");
        System.out.println(MountainTrail);
        System.out.println("Distance " + MountainTrail.getLength());
        System.out.println("difficulty " + trail.isDifficult(0, trail.Trail.size()-1));
        System.out.println("level " + trail.LevelTrailSegment(0, trail.Trail.size()-1));
        System.out.println("difficulty 3-4 " + trail.isDifficult(3, 4));
        System.out.println("level 5-6 " + trail.LevelTrailSegment(5, 6));
    }
}